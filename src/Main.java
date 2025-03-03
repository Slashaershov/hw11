import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        doExercise1(2035);
        doExercise2(1, 2016);
        int currentYear = LocalDate.now().getYear();
        doExercise3(currentYear);
    }

    private static void print(String msg)
    {
        System.out.println(msg);
    }

    private static void printLine()
    {
        print("");
    }

    private static void doExercise1(int year)
    {
        if (checkLeapYear(year))
        {
            print(year + "  год — високосный год");
        }
        else
        {
            print(year + "  год — не високосный год");
        }
        printLine();
    }

    private static boolean checkLeapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static void doExercise2(int typeOS, int clientDeviceYear)
    {
        printMsgAboutVersion(typeOS, clientDeviceYear);
        printLine();
    }

    private static void printMsgAboutVersion(int typeOS, int clientDeviceYear)
    {
        String versionTypeStr = clientDeviceYear < 2015 ? "облегченную" : "обычную";
        String osTypeStr = switch (typeOS)
        {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> throw new RuntimeException("Не зарегистрированная ОС");
        };
        print("Установите " + versionTypeStr + " версию приложения для " + osTypeStr + " по ссылке");
    }

    private static void doExercise3(int deliveryDistance)
    {
        int delivaryDuration = calcDelivaryDuration(deliveryDistance);
        if (delivaryDuration == -1)
        {
            System.out.println("Доставка так далеко не производится");
            return;
        }
        System.out.println("Потребуется дней: " + delivaryDuration);
    }

    private static int calcDelivaryDuration(int deliveryDistance)
    {
        if (deliveryDistance < 20)
        {
            return 1;
        }
        if (deliveryDistance < 60)
        {
            return 2;
        }
        if (deliveryDistance < 100)
        {
            return 3;
        }
        return -1;
    }
}