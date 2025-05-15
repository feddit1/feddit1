package project;

import java.util.ArrayList;
import java.util.List;

public class Checklist {
	
		public static List<Check> getAllCheck(){
		List<Check> checklist = new ArrayList<Check>();
		
		checklist.add(new Check("피로감","우루샷"));
		checklist.add(new Check("눈 건강","루테인"));
		checklist.add(new Check("피부 건강","히알루론산"));
		checklist.add(new Check("체지방","다이어트"));
		checklist.add(new Check("혈관/혈액순환","폴릭애시드"));
		checklist.add(new Check("혈중 콜레스테롤","레시틴"));
		checklist.add(new Check("간 건강","밀크씨슬"));
		checklist.add(new Check("장 건강","유산균"));
		checklist.add(new Check("스트레스/수면","슬림나이트"));
		checklist.add(new Check("면역 기능","우루사"));
		
		return checklist;
		
		}

}
