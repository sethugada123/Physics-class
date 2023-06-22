public class Energy extends Physics{

    void accessingGravity(){
        System.out.println(getGravity());
        setGravity(9.8f);
        System.out.println(getGravity());
    }
    float Potentialenergy(float mass, float height, float gravity){
        return (mass * height * gravity);
    }


}