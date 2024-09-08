package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> q=new ArrayList();
		q.add(new Laptop("Dell","Alience",50000));
		q.add(new Laptop("Acer","Nitro",25000));
		q.add(new Laptop("Asus","Vivobook",40000));
		
		System.out.println(q);
		System.out.println();
		for(int i=0; i<q.size();i++) {
			if(q.get(i).price>30000) {
				System.out.println(q.get(i));
			}
		}
		System.out.println();
		
		List<Laptop> res=q.stream().filter(p->p.price<40000).collect(Collectors.toList());
		System.out.println(res);
		System.out.println();
		List<Laptop> res1=q.stream().filter(p->p.brand.startsWith("A")).collect(Collectors.toList());
		System.out.println(res1);
		
		double res2=q.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(res2);
	}

}
