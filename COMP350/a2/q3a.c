#include <stdio.h>
#include <math.h>

int main()
{
	double p = 2 * sqrt(2);
	for (int n = 2; n <= 34; n++)
	{
		double powerNum = pow(2, (double)n);
		p = powerNum * sqrt(2 * (1 - sqrt(1 - pow((p / powerNum), 2))));
		printf("p_%d = %e\n", n + 1, p);
	}
	return 0;
}
