public class paintJob {
    public static void main(String[] arg) {
        //   System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        //   System.out.println(getBucketCount(1.5,1.4,0.5));
        //  System.out.println(getBucketCount(2,0.5));


    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        int noOfBucketTobeBought = 0;
        double noOfBucketNeeded = 0;
        int bucketNeededInInt = 0;
        double remainder = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        } else {
            double areaOfTheWall = width * height;
            noOfBucketNeeded = areaOfTheWall / areaPerBucket;
            bucketNeededInInt = (int)Math.round(noOfBucketNeeded);
            remainder =  noOfBucketNeeded - bucketNeededInInt;
            if(remainder>0){
                bucketNeededInInt = bucketNeededInInt+1;
            }
            noOfBucketTobeBought = bucketNeededInInt - extraBucket;
        }
        return noOfBucketTobeBought;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int noOfBucketTobeBought = 0;
        double noOfBucketNeeded = 0;
        int bucketNeededInInt = 0;
        double remainder = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double areaOfTheWall = width * height;
            noOfBucketNeeded = areaOfTheWall / areaPerBucket;
            bucketNeededInInt = (int)Math.round(noOfBucketNeeded);
            remainder =  noOfBucketNeeded - bucketNeededInInt;
            if(remainder>0){
                bucketNeededInInt = bucketNeededInInt+1;
            }
            noOfBucketTobeBought = bucketNeededInInt ;
        }
        return noOfBucketTobeBought;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int noOfBucketTobeBought = 0;
        double noOfBucketNeeded = 0;
        int bucketNeededInInt = 0;
        double remainder = 0;

        if (area<=0 || areaPerBucket <= 0 ) {
            return -1;
        } else {

            noOfBucketNeeded = area / areaPerBucket;
            bucketNeededInInt = (int)Math.round(noOfBucketNeeded);
            remainder =  noOfBucketNeeded - bucketNeededInInt;
            if(remainder>0){
                bucketNeededInInt = bucketNeededInInt+1;
            }
            noOfBucketTobeBought = bucketNeededInInt;
        }
        return noOfBucketTobeBought;
    }

}
