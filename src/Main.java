import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String rezult = "The name is incorrect or the factory does not produce this brand of machines";
        Optional<CarMaker> optionalCarMaker=makeCarFromName("Skodaa");
        if(optionalCarMaker.isPresent()) {
            CarMaker carMaker = new MakerHonda();
            Car car = carMaker.makeCar();
            car.showInformationAboutCar();
        }
        else {
            System.out.println(rezult);
        }
    }

    public  static Optional <CarMaker> makeCarFromName(String name ){
        if(name!=null && name!="") {
            if(name.equals("Skoda")) {
                Optional<CarMaker> optionalCarMaker =Optional.of(new  MakerSkoda());
                return optionalCarMaker;
            }
            if (name.equals("Honda")) {
                Optional<CarMaker> optionalCarMaker =Optional.of(new MakerHonda());
                return optionalCarMaker;
            }
        }
        return Optional.ofNullable(null);
    }

}

