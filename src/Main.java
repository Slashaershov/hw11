public class Main
{
    public static void main(String[] args)
    {
        Ex1(2035);
        Ex2(1, 2016);
        Ex3(210);
    }

    private static void Print(String msg)
    {
        System.out.println(msg);
    }

    private static void PrintLine()
    {
        Print("");
    }

    private static void Ex1(int year)
    {
        if (IsLeapYear(year))
        {
            Print(year + "  год — високосный год");
        }
        else
        {
            Print(year + "  год — не високосный год");
        }
        PrintLine();
    }

    private static boolean IsLeapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 100 == 0);
    }

    private static void Ex2(int typeOS, int clientDeviceYear)
    {
        String versionTypeStr = clientDeviceYear < 2015 ? "облегченную" : "обычную";
        String osTypeStr = switch (typeOS)
        {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> throw new RuntimeException("Не зарегистрированная ОС");
        };
        Print("Установите " + versionTypeStr + " версию приложения для " + osTypeStr + " по ссылке");
        PrintLine();
    }

    private static void Ex3(int deliveryDistance)
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