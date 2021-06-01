package Test;// 要求：分别传入两个整型数：学习成绩（50%）和综合测评成绩（50%），如果任何一方都在60分以上，并且总评>=90，一等奖学金，总评>=85，二等奖学金，其余没有奖学金。

public class FunctionDemo {

    public static String getAwards(int usual, int examination) {

        if (usual > 60 || examination > 60) {
            int sum = usual / 2 + examination / 2;
            if (sum >= 90) {
                return "一等奖";
            } else if (sum >= 85) {
                return "二等奖";
            } else {
                return "没有奖";
            }
        } else {
            return "没有奖";
        }
    }

    public static void main(String[] args) {
        System.out.println(getAwards(98, 100));
    }
}
