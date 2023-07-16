class Solution {
public:
    vector<int> smallestSufficientTeam(vector<string>& req_skills, vector<vector<string>>& people) {

      const int n = req_skills.size();
      const int nSkills = 1 << n;

      unordered_map <string, int> skillToId;

      unordered_map<int, vector<int>> map;
      map.reserve(nSkills);
      map[0] = {};

      for (int i = 0; i < n; i++){
        skillToId[req_skills[i]] = i;
      }

      auto getSkill = [&](const vector<string>& person){
        int mask = 0;
        for (const string& skill : person){
          if (const auto it = skillToId.find(skill); it != skillToId.cend()){
            mask |= 1 << it->second;
          }
        }
        return mask;
      }; 

      for (int i = 0; i < people.size(); ++i){
        const int currSkill = getSkill(people[i]);
        for (const auto& [mask, indices]: map){
          const int newSkillSet = mask | currSkill;
          if (!map.count(newSkillSet) || map[newSkillSet].size() > indices.size() + 1){
            map[newSkillSet] = indices; 
            map[newSkillSet].push_back(i);
          }
        }
      }

      return map[nSkills - 1];
        
    }
};
