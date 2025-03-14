package a;

public class Main {
	public static void main(String[] args) {
		
		Aircraft listaAvioane[] = new Aircraft[100];
		Aircraft listaAvioaneCapabileCargo[] = new Aircraft[100];
		double listaCargo[] = new double[100];
		for(int i = 0; i<100; i++)
		{
			listaAvioane[i] = null;
			listaCargo[i] = 0;
			listaAvioaneCapabileCargo[i] = null;
		}
		
		Airliner avionPasageri = new Airliner(180, 500.45);
		listaAvioane[0] = avionPasageri;
		listaCargo[0] = avionPasageri.getMaximumPayload();
		
		Airliner avionDoarPasageri = new Airliner(30, 0);
		listaAvioane[1] = avionDoarPasageri;
		listaCargo[1] = avionDoarPasageri.getMaximumPayload();
		
		Freighter avionCargo1 = new Freighter(4500);
		listaAvioane[2] = avionCargo1;
		listaCargo[2] = avionCargo1.getMaximumPayload();
		
		Freighter avionCargo2 = new Freighter(6000);
		listaAvioane[3] = avionCargo2;
		listaCargo[3] = avionCargo2.getMaximumPayload();
		
		Drone drona1 = new Drone(100);
		listaAvioane[4] = drona1;
		listaCargo[4] = drona1.getMaximumPayload();
		
		Drone drona2 = new Drone(0);
		listaAvioane[5] = drona2;
		listaCargo[5] = drona2.getMaximumPayload();
		
		
		int i = 0;
		int j = 0;
		while(listaAvioane[i] != null)
		{
			if(listaCargo[i] != 0)
			{
				listaAvioaneCapabileCargo[j] = listaAvioane[i];
				j++;
			}
			i++;
		}
	}
}