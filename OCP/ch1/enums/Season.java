package ch1.enums;

public enum Season {
    WINTER("Low"), 
    SPRING("Medium"), 
    SUMMER("High"), 
    FALL("Medium");

    private String expectedVisitiors;

    Season(String expectedVisitiors) {
	this.expectedVisitiors = expectedVisitiors;
    }

    public void printExpectedVisitors() {
	System.out.println(expectedVisitiors);
    }

    public static void main(String[] args) {
	
	Season.SUMMER.printExpectedVisitors();
	
	for (Season season : Season.values()) {
	    System.out.println(season.name() + " " + season.ordinal());
	}

	Season s1 = Season.valueOf("SUMMER");

	switch (s1) {
	    case WINTER:
		System.out.println("it is winter");
		break;
	    case SUMMER:
		System.out.println("it is summer");
		break;
	    case SPRING:
		System.out.println("it is spring");
		break;
	    case FALL:
		System.out.println("it is fall");
		break;
	} // end of switch
    } // end of main
}
