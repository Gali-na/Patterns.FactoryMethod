class  MakerSkoda  implements  CarMaker{
    @Override
    public Car makeCar() {
        return  new Skoda();
    }
}