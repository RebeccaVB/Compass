
public class CoordinatesNSEW {

	public String findDirection(String input) {
		String[] direction = input.split(",");

		String result = null;
		String toX = direction[2];
		String fromY = direction[1];
		String fromX = direction[0];
		String toY = direction[3];
		if (fromX.equals(toX) && fromY.equals(toY)) {
			// if O equals Q and P equals R
			result = "Here"; // then we're already Here!
		} else if (fromX.compareTo(toX) < 0 && fromY.equals(toY)) {
			result = "E";
		} else if (fromX.compareTo(toX) > 0 && fromY.equals(toY)) {
			// if O is greater than Q and P equals R
			result = "W"; // then we need to go West!
		} else if (fromX.equals(toX) && fromY.compareTo(toY) > 0) {
			result = "S";
		} else if (fromX.equals(toX) && fromY.compareTo(toY) < 0) {
			result = "N";
		} else if (fromX.compareTo(toX) > 0 && fromY.compareTo(toY) > 0) {
			result = "SW";
		} else if (fromX.compareTo(toX) < 0 && fromY.compareTo(toY) < 0) {
			result = "NE";
		} else if (fromX.compareTo(toX) < 0 && fromY.compareTo(toY) > 0) {
			result = "SE";
		} else if (fromX.compareTo(toX) > 0 && fromY.compareTo(toY) < 0) {
			result = "NW";
		}
		return result;
	}
}
