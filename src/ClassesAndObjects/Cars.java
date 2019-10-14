package ClassesAndObjects;

public class Cars {


        //public --> one of access modifier unrestricted access any one can use it
        //private--> only within the class
        //protected --> can access within the package
        //class is a blue print of an object
        private int doors;
        private int wheels;
        private String models;
        private String engine;
        private String color;


    public void setModels(String models) {
        String validModel = models.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("holden")){
            this.models = models;
        }
        else
        this.models = "Unknown";
      //  System.out.println(models);
    }

    public String getModels() {
        return models;
    }
}
