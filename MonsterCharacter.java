public class MonsterCharacter extends Character implements FireAttackBehaviour {
    MonsterCharacter(int id,String name){
        super(id,name);
    }
    @Override
    public void MonstarCharacter.fireAttackTo(Character other){
        System.out.println("Monstar Character takes damage");
        other.takeDamage(50);
    }
    @Override
    public void airAttackTo(Character other){
        System.out.println("Monstar Character air attacks");
        other.takeDamage(20);
    }
}
    @Override
    void defense() {
        if (this.health < 100) {
            this.health += 10;
        } else if (this.health > 100) {
            this.health = 100;
        }
    }
}
