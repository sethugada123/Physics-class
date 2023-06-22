public class Physics{

    private float gravity = 9.8f;

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    float Potentialenergy(float mass, float height, float gravity){
        return (mass * height * gravity) ;
    }

    float divide(float numberOne, float numberTwo){
        return numberOne / numberTwo;
    }

    float powTwo(float number){
        return number * number;
    }
}