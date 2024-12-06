using System;
using System.Text;
using System.Linq;

class Program
{
    static void Main()
    {
        // 입력 받기
        string input = Console.ReadLine();
        int[] tokens = input
                .Split(' ', StringSplitOptions.RemoveEmptyEntries) // 공백 제거
                .Select(int.Parse) // 각 문자열을 정수로 변환
                .ToArray();
        
        Array.Sort(tokens);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        sb.Append(tokens[0]).Append(" ").Append(tokens[1]).Append(" ").Append(tokens[2]);
        Console.WriteLine(sb.ToString());
    }
}