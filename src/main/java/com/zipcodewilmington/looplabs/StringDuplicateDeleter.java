package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String nonDuplicatesString = "";

        for (int i = 0; i < array.length; i++) {
            String integer = array[i];
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


        if (nonDuplicatesString.equals("")){
            return new String[0];
        }


        return stringResult;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String nonDuplicatesString = "";

        for (int i = 0; i < array.length; i++) {
            String integer = array[i];
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


        return stringResult;
    }
}
