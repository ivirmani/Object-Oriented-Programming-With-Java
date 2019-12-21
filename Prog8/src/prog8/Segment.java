package prog8;

public class Segment extends Circle {
	float segmentArea(float r, float a, float h) {
		return (float) ((float) Math.pow(r, 2)
				* Math.pow(((r - h) / r) - ((r - h) * (2 * r * h - Math.pow(h, 2))), 1 / 2));
	}
}
