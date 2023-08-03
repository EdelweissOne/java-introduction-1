package com.hillel.lesson4;

public class HomeworkTask2 {

    // task 2
    public static void main(String[] args) {
        int cat = 8;
        int dog = 24;
        int portion = 50;
        int portionCost = 2;
        int onsens = 3;

        int calculatedFoodCat = calculetFoodMonth(cat, portion, onsens);
        int calculatedFoodDog = calculetFoodMonth(dog, portion, onsens);

        System.out.println(" Корма для котов в месяц : " + calculatedFoodCat);
        System.out.println(" Корма для собак в месяц : " + calculatedFoodDog);

        int calculatedCostCat = calculetCostFood(calculatedFoodCat, portionCost, portion);
        int calculatedCostDog = calculetCostFood(calculatedFoodDog, portionCost, portion);

        System.out.println(" Сумма в месяц на содержание : " + (calculatedCostCat + calculatedCostDog));
    }

    public static int calculetFoodMonth(int pet, int portion, int onsens) {
        return (pet * (portion * onsens)) * 30;
    }

    public static int calculetCostFood(int countFood, int portionCost, int portionCount) {
        return (countFood / portionCount) * portionCost;
    }

}
