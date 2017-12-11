package jp.ac.uryukyu.ie.e175752;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }


    public LivingThing(String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
    }
    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getAttack() { return attack; }
    public void attack(LivingThing opponent){
        if( dead == false && hitPoint >0) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
