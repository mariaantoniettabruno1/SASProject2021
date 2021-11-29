package businesslogic.kitchenTask;

import businesslogic.recipe.Recipe;
import businesslogic.turn.Turn;

import java.util.ArrayList;

public class cookingTask {
    Recipe recipe;
    ArrayList<Turn> turn;
    double preparation_time;
    int quantity;
    int difficulty;
    int portions;
    int importance;

    public cookingTask(Recipe recipe, ArrayList<Turn> turn, double preparation_time, int quantity, int difficulty, int portions, int importance) {
        this.recipe = recipe;
        this.turn = turn;
        this.preparation_time = preparation_time;
        this.quantity = quantity;
        this.difficulty = difficulty;
        this.portions = portions;
        this.importance = importance;
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
}
