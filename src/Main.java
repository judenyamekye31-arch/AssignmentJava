//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
double angle =
        Math.toRadians(30);
double sinValue= Math.sin(angle);
        double cosValue= Math.cos(angle);
        double tanValue= Math.tan(angle);


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Angle: 30 degrees");
                    System.out.println("sin(30) = " + sinValue);
                            System.out.println("cos(30) = " + cosValue);
                                    System.out.println("tan(30) = " + tanValue);
}
}