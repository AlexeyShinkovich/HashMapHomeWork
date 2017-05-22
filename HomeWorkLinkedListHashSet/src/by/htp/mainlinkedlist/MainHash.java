package by.htp.mainlinkedlist;

import java.util.Set;
import java.util.TreeSet;

import by.htp.entitystudent.Student;

import java.util.HashSet;
import java.util.Iterator;

public class MainHash {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("Alex", "Popov", "Victorovich"));
		set.add(new Student("Petr", "Sidorov", "Nikolaivich"));
		set.add(new Student("Colin", "Connover", "Philipovich"));
		set.add(new Student("Tom", "Ivanov", "Leonidivich"));
		set.add(new Student("Ivan", "Ivanov", "Leonidivich"));
		set.add(new Student("Ivan", "Ivanov", "Denisovich"));
		set.add(new Student("Scott", "Phelps", "Sergeevich"));
		set.add(new Student("Phil", "Pirogor", "Petrovich"));
		set.add(new Student("Tom", "Ivanov", "Leonidivich"));
		set.add(new Student("Vladimir", "Selezhev", "Ivanovich"));
		set.add(new Student("Artem", "Horoshun", "Alekseevich"));
		set.add(new Student("Donni", "Horoshun", "Denisivich"));
		set.add(new Student("Donni", "Horoshun", "Petrovich"));
		set.add(new Student("Pavel", "Pavlov", "Denisovich"));
		set.add(new Student("Evgeniy", "Ribak", "Semenovich"));
		set.add(new Student("Philip", "Ruchkin", "Artemovich"));
		set.add(new Student("Tom", "Ivanov", "Leonidivich"));

		TreeSet<Student> treeSet = new TreeSet<Student>(set);
		Iterator<Student> iteratorMyTreeSet = treeSet.iterator();
		// while (iteratorMyTreeSet.hasNext()) {
		// Student studName = iteratorMyTreeSet.next();
		// {
		// System.out.println(studName.toString());
		// }
		
		boolean isOdd = true;
		while (iteratorMyTreeSet.hasNext()) {
			Student studName = iteratorMyTreeSet.next();
			if (isOdd) {
				System.out.println(studName.getFirstname() + " " + studName.getName() + " " + studName.getNameF());
				isOdd=false;
			}
			else  {
				iteratorMyTreeSet.remove();
				isOdd=true;
			}
			
		}
	}
}
