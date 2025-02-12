class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MAX = 2**31 - 1  # Maximum 32-bit signed integer
        INT_MIN = -2**31     # Minimum 32-bit signed integer

        result = 0
        sign = -1 if x < 0 else 1
        x = abs(x)

        while x != 0:
            digit = x % 10  # Extract the last digit
            x //= 10        # Remove the last digit

        # Check for overflow
            if result > (INT_MAX - digit) // 10:
                return 0

            result = result * 10 + digit

        return sign * result

        
        