package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String nonDuplicatesString = "";

        for (int i = 0; i < array.length; i++) {
            Integer integer = array[i];
            Integer counter = 0;

            for(int j = 0; j < array.length; j++){
                if(integer.equals(array[j])){
                    counter++;
                }
            }
            if(!(counter >= maxNumberOfDuplications)){
                nonDuplicatesString += array[i] + " ";
            }
        }
        

        String[] stringResult = nonDuplicatesString.split(" ");
        Integer[] result = new Integer[stringResult.length];

        if (nonDuplicatesString.equals("")){
            return new Integer[0];
        } else {

            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.valueOf(stringResult[i]);

            }
        }


        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String nonDuplicatesString = "";

        for (int i = 0; i < array.length; i++) {
            Integer integer = array[i];
            Integer counter = 0;

            for(int j = 0; j < array.length; j++){
                if(integer.equals(array[j])){
                    counter++;
                }
            }
            if(!(counter == exactNumberOfDuplications)){
                nonDuplicatesString += array[i] + " ";
            }
        }
        String[] stringResult = nonDuplicatesString.split(" ");
        Integer[] result = new Integer[stringResult.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.valueOf(stringResult[i]);

        }



        return result;
    }
}
