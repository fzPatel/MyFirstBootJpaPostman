package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataService 
{
	@Autowired
	private DataRepo rd;
	
	
private List<Data> data=new ArrayList<Data>(Arrays.asList
	(
	new Data("firoz","indore","firoz"),
	new Data("abc","abc123","qwe"),
	new Data("abc","abc123","zxc")
	));

public 	List<Data> getAlldata()
{
	List<Data> data=new ArrayList<Data>();
	
	//return data;	
	rd.findAll().forEach(data::add);
	return data;
	
}

public 	Optional<Data> getAlldataById(String name)
{
	//return data.stream().filter(t -> t.getName().equals(name)).findFirst().get();	

return rd.findById(name);

}
public 	void addData(Data d)
{
	rd.save(d);
}

public 	void updateData(String name,Data da)
{	
	/*for(int i=0;i<data.size();i++) 
	{
		Data d=data.get(i);
			if(d.getName().equals(name)) 
			{
				
				data.set(i, da);
				return;

			}
		
	}*/
	
	rd.save(da);
	
	
}

public 	void deleteData(String name)
{	
	//data.removeIf(t -> t.getName().equals(name));
	rd.deleteById(name);

}
}
