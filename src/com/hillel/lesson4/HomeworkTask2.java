package com.hillel.lesson4;

public class HomeworkTask2 {

    // task 2
    public static void main(String[] args) {
        int cat = 8;
        int dog = 24;
        int portion = 50;
        int portionCost = 2;
        int onsens = 3;


        int calculatedCatFoodMonth = calculatedFoodMonth(cat, portion, onsens );
        System.out.println(" Корма для котов в месяц : " + calculatedCatFoodMonth);
        int calculetdDogFoodMonth = calculatedFoodMonth(dog, portion, onsens);
        System.out.println(" Корма для собак в месяц : " + calculetdDogFoodMonth);

        int calculatedPetAllFood = calculatedAll(calculatedCatFoodMonth,  calculetdDogFoodMonth);
        int calculatedPetCostFood = calculatedCostFood(calculatedPetAllFood, portionCost, portion);
        System.out.println(" Сумма в месяц на содержание : " + calculatedPetCostFood);
    }
    public static int calculatedAll(int calculatedCostCat, int calculatedCostDog) {

        return (calculatedCostCat + calculatedCostDog);

    }
    public static int calculatedFoodMonth(int pet, int portion, int onsens) {

        return (pet * (portion * onsens)) * 30;
    }
    public static int calculatedCostFood(int countFood, int portionCost, int portionCount) {
        return (countFood / portionCount) * portionCost;
    }

}
