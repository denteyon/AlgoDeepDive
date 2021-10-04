# def binary(n):
#     str = ''
#     while n:
#         str += n % 2 + '0'
#         n /= 2
#     if str == '':
#         return "0"
#     str = str[::-1]
#     return str

# def reverse_binary(s):
#     n = 0
#     for c in s:
#         n = n * 2 + c - '0'
#     return n

# def func(n):
#     str = binary(n)

#     N = len(str)

#     candidates = []

#     # one more digit (smallest)
#     # 10...01
#     candidates.append(pow(2, N) + 1);

#     # one less digit (biggest)
#     # 11...11
#     candidates.append(pow(2, N - 1) - 1);

#     # same number of digit
#     # the closest must be in middle digit +1, 0, -1
#     # then flip left to right
#     prefix = reverse_binary(str[0:(N + 1) // 2]);
#     for (int i = -1; i <= 1; i++) {
#         p = binary(prefix + i);
#         pp = p + string(p.rbegin() + N % 2, p.rend());
#         candidates.append(reverse_binary(pp));
#     }

#     int min0 = INT_MAX;
#     for (auto c : candidates) {
#         min0 = min(min0, abs(c - n));
#     }
#     return min0

# int main() {
#     cout<<func(1)<<endl;
#     cout<<func(4)<<endl;
#     cout<<func(28)<<endl;
#     cout<<func(123)<<endl;
# }