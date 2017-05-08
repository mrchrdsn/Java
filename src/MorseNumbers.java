
public class MorseNumbers {

	private static MorseNumbers mn = new MorseNumbers();

    private MorseNumbers(){}

    public static MorseNumbers getInstance( ) {
        return mn;
    }

    private String[] morseArray = new String[10];

    public String getMorseValue(String timeParameter){
        morseArray[0] = "-----";
        morseArray[1] = ".----";
        morseArray[2] = "..---";
        morseArray[3] = "...--";
        morseArray[4] = "....-";
        morseArray[5] = ".....";
        morseArray[6] = "-....";
        morseArray[7] = "--...";
        morseArray[8] = "---..";
        morseArray[9] = "----.";

        String formatted = String.format("%02d", Integer.parseInt(timeParameter));
        String morseTimeComponent;
        String firstPart;
        String secondPart;

        firstPart = String.valueOf(formatted.charAt(0));
        secondPart = String.valueOf(formatted.charAt(1));

        Integer first = Integer.valueOf(firstPart);
        Integer second = Integer.valueOf(secondPart);

        morseTimeComponent = morseArray[first] + "/" + morseArray[second];

        return morseTimeComponent;
    }

}
