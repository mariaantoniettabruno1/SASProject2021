package businesslogic.kitchenTask;

import businesslogic.recipe.Recipe;
import businesslogic.turn.Turn;

import java.util.ArrayList;
import java.util.Comparator;

public class cookingTask {
   private Recipe recipe;
   private ArrayList<Turn> turn;
   private double preparation_time;
   private int quantity;
   private int difficulty;
   private int portions;
   private int importance;

    public cookingTask create(Recipe recipe, ArrayList<Turn> turn, double preparation_time, int quantity, int difficulty, int portions, int importance) {
        this.recipe = recipe;
        this.turn = turn;
        this.preparation_time = preparation_time;
        this.quantity = quantity;
        this.difficulty = difficulty;
        this.portions = portions;
        this.importance = importance;
        return this;
    }

    public double getPreparation_time() {
        return preparation_time;
    }

    public void setPreparation_time(double preparation_time) {
        this.preparation_time = preparation_time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
    public class ImportanceComparator implements Comparator<cookingTask> {
        @Override
        public int compare(cookingTask ctsk1, cookingTask ctsk2) {
            return (Integer.valueOf(ctsk1.importance).compareTo(ctsk2.importance));
        }
    }

    public class DifficultyComparator implements Comparator<cookingTask> {
        @Override
        public int compare(cookingTask ctsk1, cookingTask ctsk2) {
            return  (Integer.valueOf(ctsk1.difficulty).compareTo(ctsk2.difficulty));
        }
    }
}
