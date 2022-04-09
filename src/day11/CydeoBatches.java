package day11;

public class CydeoBatches {
    public static void main(String[] args) {

        String batchType = "EU";
        String result = "";

        System.out.println("--------if Statement------------");
        boolean validBatch = batchType.equals("US morning") || batchType.equals("US evening") || batchType.equals("EU");

        if(validBatch){
            if(batchType.equals("US morning")){
                result = "Class times are 10-5 EST. M, T, Th, F.";
            }else if(batchType.equals("US evening")){
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }else{
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }else{
            result = "invalid Batch";
        }
        System.out.println(result);

        System.out.println("--------switch Statement------------");

        switch (batchType){
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "invalid Batch";
        }
        System.out.println(result);

        System.out.println("--------if & switch Statement------------");

        if(validBatch){

            switch (batchType) {
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }
        }else{
            result = "invalid Batch";
        }
        System.out.println(result);
    }
}
