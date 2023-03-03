import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
	String name;
	int language, english, math;
	Student(String name, int language, int english, int math){
		this.name = name;
		this.language = language;
		this.english = english;
		this.math = math;
	}
	@Override
	public int compareTo(Student s) {
		if(this.math == s.math && this.english == s.english && this.language == s.language) 
			return this.name.compareTo(s.name);
		else if(this.english == s.english && this.language == s.language) 
			return s.math - this.math;
		else if(this.language == s.language) return this.english - s.english;
		else  return s.language - this.language;
		 
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name).append("\n");
		return sb.toString();
	}
	
}

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Student[] index = new Student[N];
		
		for(int i = 0 ; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int language = Integer.parseInt(st.nextToken());
			int english = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			index[i] = new Student(name, language, english, math);
		}
		Arrays.sort(index);
		
		for(int i = 0 ; i < N; i++) {
			sb.append(index[i].print());
		}
		System.out.println(sb.toString());
	}

}
