class  MakerHonda implements  CarMaker{
    @Override
    public Car makeCar() {
        return  new Honda();
    }
}