package vdev.br.edu.ifpe.atividade.exemplo.dois.factory;

import vdev.br.edu.ifpe.atividade.exemplo.dois.polygon.Pentagon;
import vdev.br.edu.ifpe.atividade.exemplo.dois.polygon.Polygon;
import vdev.br.edu.ifpe.atividade.exemplo.dois.polygon.Square;
import vdev.br.edu.ifpe.atividade.exemplo.dois.polygon.Triangle;

public class PolygonFactory {

	public static Polygon getPolygon(int numberOfSides) {

		if (numberOfSides == 3) {
			return new Triangle();
		}

		if (numberOfSides == 4) {
			return new Square();
		}

		if (numberOfSides == 5) {
			return new Pentagon();
		}
		return null;
	}

}
