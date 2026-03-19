public class variable {
    public static void main(String[] args) {
        int attack1 =220;//攻击
        int defence1 = 85;//防御
        double hp1 =1012.5;//血量
        double skill_bonus1 =1.2;//技能加成。
        
        int attack2 =210;
        int defence2 = 80;
        double hp2 =1223.3;
        double skill_bonus2 =1.3;

        //我方进行一次普通攻击，造成多少伤害，对方还有多少血量
        //普通攻击造成伤害的公式：攻击力-对方防御力
        double damage1 =attack1 - defence2;
        hp2 =hp2 -damage1;
        System.out.println(hp2);//1080.3
    }
}