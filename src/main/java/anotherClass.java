public class anotherClass<typeOne, typeTwo> {
    typeOne thingOne;
    typeTwo thingTwo;

    public anotherClass(typeOne thingOne, typeTwo thingTwo) {
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
    }

    public typeOne getThingOne() {
        return thingOne;
    }

    public void setThingOne(typeOne thingOne) {
        this.thingOne = thingOne;
    }

    public typeTwo getThingTwo() {
        return thingTwo;
    }

    public void setThingTwo(typeTwo thingTwo) {
        this.thingTwo = thingTwo;
    }
}
