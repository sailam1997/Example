import java.util.Scanner;
public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number: ");
        while (true) {
            int number = sc.nextInt();
            int hang_tram = number / 100;
            int hang_chuc = (number - hang_tram * 100) / 10;
            int hang_don_vi = (number - hang_tram * 100 - hang_chuc * 10);
            if (number >= 0 && number < 1000) {
                if (hang_tram == 0) {
                    if (hang_chuc == 0 && hang_don_vi != 0) {
                        switch (hang_don_vi) {
                            case 1:
                                System.out.println("one");
                                break;
                            case 2:
                                System.out.println("two");
                                break;
                            case 3:
                                System.out.println("three");
                                break;
                            case 4:
                                System.out.println("four");
                                break;
                            case 5:
                                System.out.println("five");
                                break;
                            case 6:
                                System.out.println("six");
                                break;
                            case 7:
                                System.out.println("seven");
                                break;
                            case 8:
                                System.out.println("eight");
                                break;
                            case 9:
                                System.out.println("nine");
                                break;
                        }
                    } else if (hang_chuc != 0 && hang_don_vi == 0) {
                        switch (hang_chuc) {
                            case 1:
                                System.out.println("ten");
                                break;
                            case 2:
                                System.out.println("twenty");
                                break;
                            case 3:
                                System.out.println("thirty");
                                break;
                            case 4:
                                System.out.println("fourty");
                                break;
                            case 5:
                                System.out.println("fivety");
                                break;
                            case 6:
                                System.out.println("sixty");
                                break;
                            case 7:
                                System.out.println("seventy");
                                break;
                            case 8:
                                System.out.println("eighty");
                                break;
                            case 9:
                                System.out.println("ninety");
                                break;
                        }
                    } else if (hang_chuc == 0) {
                        System.out.println("zero");
                    } else {
                        switch (hang_chuc) {
                            case 1:
                                System.out.print("one ");
                                break;
                            case 2:
                                System.out.print("two ");
                                break;
                            case 3:
                                System.out.print("three ");
                                break;
                            case 4:
                                System.out.print("four ");
                                break;
                            case 5:
                                System.out.print("five ");
                                break;
                            case 6:
                                System.out.print("six ");
                                break;
                            case 7:
                                System.out.print("seven ");
                                break;
                            case 8:
                                System.out.print("eight ");
                                break;
                            case 9:
                                System.out.print("nine ");
                                break;
                        }
                        switch (hang_don_vi) {
                            case 1:
                                System.out.println("one.");
                                break;
                            case 2:
                                System.out.println("two.");
                                break;
                            case 3:
                                System.out.println("three.");
                                break;
                            case 4:
                                System.out.println("four.");
                                break;
                            case 5:
                                System.out.println("five.");
                                break;
                            case 6:
                                System.out.println("six.");
                                break;
                            case 7:
                                System.out.println("seven.");
                                break;
                            case 8:
                                System.out.println("eight.");
                                break;
                            case 9:
                                System.out.println("nine.");
                                break;
                        }
                    }
                } else {
                    switch (hang_tram) {
                        case 1:
                            System.out.print("one hundred ");
                            break;
                        case 2:
                            System.out.print("two hundred ");
                            break;
                        case 3:
                            System.out.print("three hundred ");
                            break;
                        case 4:
                            System.out.print("four hundred ");
                            break;
                        case 5:
                            System.out.print("five hundred ");
                            break;
                        case 6:
                            System.out.print("six hundred ");
                            break;
                        case 7:
                            System.out.print("seven hundred ");
                            break;
                        case 8:
                            System.out.print("eight hundred ");
                            break;
                        case 9:
                            System.out.print("nine hundred ");
                            break;
                    }
                    switch (hang_chuc) {
                        case 1:
                            System.out.print("and ten ");
                            break;
                        case 2:
                            System.out.print("and twenty ");
                            break;
                        case 3:
                            System.out.print("and thirty ");
                            break;
                        case 4:
                            System.out.print("and fourty ");
                            break;
                        case 5:
                            System.out.print("and fivety ");
                            break;
                        case 6:
                            System.out.print("and sixty ");
                            break;
                        case 7:
                            System.out.print("and seventy ");
                            break;
                        case 8:
                            System.out.print("and eighty ");
                            break;
                        case 9:
                            System.out.print("and ninety ");
                            break;
                    }
                    switch (hang_don_vi) {
                        case 1:
                            System.out.println("one.");
                            break;
                        case 2:
                            System.out.println("two.");
                            break;
                        case 3:
                            System.out.println("three.");
                            break;
                        case 4:
                            System.out.println("four.");
                            break;
                        case 5:
                            System.out.println("five.");
                            break;
                        case 6:
                            System.out.println("six.");
                            break;
                        case 7:
                            System.out.println("seven.");
                            break;
                        case 8:
                            System.out.println("eight.");
                            break;
                        case 9:
                            System.out.println("nine. ");
                            break;
                        default:
                            System.out.println("Số bạn nhập không thỏa mãn đề bài!");
                    }
                }
            }else {
                System.out.println("Số bạn nhập không thỏa mãn đề bài!");
                System.out.println("Kết thúc chương trình!");
                break;
            }
        }

    }
}

