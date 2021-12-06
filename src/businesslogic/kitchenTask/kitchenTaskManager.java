package businesslogic.kitchenTask;

import businesslogic.UseCaseLogicException;
import businesslogic.recipe.Recipe;
import businesslogic.turn.Turn;

import java.util.ArrayList;

public class kitchenTaskManager {

    summarySheet sheet = new summarySheet();

    //event sender methods
    public void addReceiver(kitchenTaskReciver ktr){};
    public void deleteReceiver(kitchenTaskReciver ktr){};
    public void notifyCookingTaskAdded(cookingTask ctsk){};
    public void notifyCookingTaskDeleted(cookingTask ctsk){};
    public void notifyCookingTaskEdited(cookingTask ctsk){};
    public void notifySummarySheetSorted(summarySheet sheet){};
    public void notifyCookingTaskDone(cookingTask ctsk){};

    //operation methods

    public void addCookingTask(Recipe recipe, ArrayList<Turn> turn, double preparation_time, Integer quantity, Integer difficulty, Integer portions, Integer importance) throws UseCaseLogicException {
        sheet.addCookingTask(recipe,turn,preparation_time,quantity,portions,difficulty,importance);
    }

    public void deleteCookingTask(cookingTask ctsk){sheet.deleteCookingTask(ctsk);}

    public void editCookingTask( ArrayList<Turn> turn, double preparation_time, Integer quantity, Integer portions, Integer difficulty, Integer importance, cookingTask ctsk) throws UseCaseLogicException {
        sheet.editCookingTask(turn,preparation_time,quantity,portions,difficulty,importance,ctsk);
    }

    public void orderSummarySheet(boolean sortedByImportance, boolean sortedByDifficulty) throws UseCaseLogicException {
        sheet.orderSummarySheet(sortedByImportance,sortedByDifficulty);
    }

    public void openSummarySheet(){
        System.out.println(sheet.openSummarySheet());
    }

    public void makeCookingTaskDone(cookingTask ctsk){
        sheet.makeCookingTaskDone(ctsk);
    }
}
