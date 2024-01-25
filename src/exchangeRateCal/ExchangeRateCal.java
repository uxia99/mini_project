package exchangeRateCal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeRateCal {
    public static void main(String[] args) {
        // 원화 값 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력하시오");
        double enteredWon = sc.nextInt();

        // 환율 계산
        double dollar =  enteredWon / 1335.47;

        // 소숫점 두 자리까지 포맷팅
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedDollar = decimalFormat.format(dollar);

        System.out.println(formattedDollar + "$");

    }
}
