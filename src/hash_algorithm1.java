import java.util.HashMap;

public class hash_algorithm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

		// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이
		// 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

		String participant[] = { "A", "B", "C", "A" };
		String completion[] = { "A", "B", "C"};

		HashMap<String, Integer> map = new HashMap<>();

		for (String player : participant)
			map.put(player, map.getOrDefault(player, 0) + 1);
//	getOrDefault에서 밸류가 없을경우 default로 설정한 0을반환, 밸류가있으면 1을반환
//		for(String player : participant)
//			System.out.println(map.get(player));
// 	도출되는 값 : 2, 1, 1, 2

		for (String player : completion)
			map.put(player, map.get(player) - 1);
//	completion에 해당하는 플레이어들의 밸류를 1씩 빼준다		

//	for(String player : participant)
//		System.out.println(map.get(player));
//	1, 0, 0, 1

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				System.out.println(key);
			}
		}

	}
}
