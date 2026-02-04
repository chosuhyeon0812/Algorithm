using System;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string[] str_list) {

        List<string> result = new List<string>();

        for (int i = 0; i < str_list.Length; i++)
        {
            if (str_list[i] == "l")
            {
                // l 기준 왼쪽
                for (int j = 0; j < i; j++)
                    result.Add(str_list[j]);
                break;
            }
            else if (str_list[i] == "r")
            {
                // r 기준 오른쪽
                for (int j = i + 1; j < str_list.Length; j++)
                    result.Add(str_list[j]);
                break;
            }
        }

        return result.ToArray();
    }
}
