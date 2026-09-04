# INTEST - Rating 464

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Enormous Input Test

You are given $N$ integers. Find the count of numbers divisible by $K$.

### Input Format

The input begins with two positive integers $N$, $K$. The next $N$ lines contains one positive integer each denoted by $A_i$.

### Output Format

Output a single number denoting how many integers are divisible by $K$.

### Constraints
- $1 \leq N, K \leq 10^7$
- $1 \leq A_i \leq 10^9$
### Sample 1:
Input
Output

```
7 3
1
51
966369
7
9
999996
11

```

```
4
```

### Explanation:

The integers divisible by $3$ are $51, 966369, 9,$ and $999996$. Thus, there are $4$ integers in total.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T10:53:36.542Z  

```java
// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/INTEST)