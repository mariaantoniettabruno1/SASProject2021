package businesslogic.kitchenTask;

import businesslogic.UseCaseLogicException;
import businesslogic.recipe.Recipe;
import businesslogic.turn.Turn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class summarySheet extends cookingTask {
    private ArrayList<cookingTask> sheetCookingTask;

    public summarySheet(ArrayList<cookingTask> sheetCookingTask) {
        this.sheetCookingTask = sheetCookingTask;
    }

    public void addCookingTask(ArrayList<Turn> turn, double preparation_time, int quantity, int portions, int difficulty, int importance, Recipe recipe) throws UseCaseLogicException {
        if(recipe!=null && turn!=null && preparation_time!=0.00){
            cookingTask ctsk = create(recipe, turn, preparation_time, quantity, difficulty, portions, importance);
            sheetCookingTask.add(ctsk);
        }
        else throw new UseCaseLogicException();

    }

    public void deleteCookingTask(cookingTask ctsk) {
        sheetCookingTask.remove(ctsk);
    }

    public void editCookingTask(ArrayList<Turn> turn, double preparation_time, int quantity, int portions, int difficulty, int importance, Recipe recipe, cookingTask ctsk)throws UseCaseLogicException {
        if(recipe!=null && turn!=null && preparation_time!=0.00) {
            ctsk.setDifficulty(difficulty);
            ctsk.setImportance(importance);
            ctsk.setPortions(portions);
            ctsk.setPreparation_time(preparation_time);
        }
        else throw new UseCaseLogicException();
    }

    public void orderSummarySheet(boolean sortedByImportance, boolean sortedByDifficulty) throws UseCaseLogicException {
        if (sortedByDifficulty == sortedByImportance) throw new UseCaseLogicException();

        else if (sortedByDifficulty) {
            sheetCookingTask.sort(new DifficultyComparator());
        } else {
            sheetCookingTask.sort(new ImportanceComparator());
        }

    }

}