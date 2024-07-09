class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int len = skill.length();
        for (int i = 0; i < skill_trees.length; i++) {
            int index = 0, flag = 0;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (index == skill.length()) break;
                String str = Character.toString(skill_trees[i].charAt(j));
                if (skill.contains(str)) {
                    if (skill.charAt(index) != skill_trees[i].charAt(j)) {
                        flag = 1;
                        break;
                    } else {
                        index += 1;
                    }
                }
            }
            if (flag == 0) answer += 1;
        }
        return answer;
    }
}