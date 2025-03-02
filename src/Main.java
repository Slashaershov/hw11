import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        DoExercise1(2035);
        DoExercise2(1, 2016);
        int currentYear = LocalDate.now().getYear();
        DoExercise3(currentYear);
    }

    private static void Print(String msg)
    {
        System.out.println(msg);
    }

    private static void PrintLine()
    {
        Print("");
    }

    private static void DoExercise1(int year)
    {
        if (CheckLeapYear(year))
        {
            Print(year + "  год — високосный год");
        }
        else
        {
            Print(year + "  год — не високосный год");
        }
        PrintLine();
    }

    private static boolean CheckLeapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static void DoExercise2(int typeOS, int clientDeviceYear)
    {
        PrintMsgAboutVersion(typeOS, clientDeviceYear);
        PrintLine();
    }

    private static void PrintMsgAboutVersion(int typeOS, int clientDeviceYear)
    {
        String versionTypeStr = clientDeviceYear < 2015 ? "облегченную" : "обычную";
        String osTypeStr = switch (typeOS)
        {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> throw new RuntimeException("Не зарегистрированная ОС");
        };
        Print("Установите " + versionTypeStr + " версию приложения для " + osTypeStr + " по ссылке");
    }

    private static void DoExercise3(int deliveryDistance)
    {
        int delivaryDuration = CalcDelivaryDuration(deliveryDistance);
        if (delivaryDuration == -1)
        {
            System.out.println("Доставка так далеко не производится");
            return;
        }
        System.out.println("Потребуется дней: " + delivaryDuration);
    }

    private static int CalcDelivaryDuration(int deliveryDistance)
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