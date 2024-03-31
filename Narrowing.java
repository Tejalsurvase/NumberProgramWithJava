class Narrowing 
{
	public static void main(String[] args) 
	{  

		byte a = (byte)127 ;
		System.out.println(a); //127

		byte b = (byte)32675 ;
		System.out.println(b) ; //-93

		byte c = (byte)332675 ;
		System.out.println(c) ; //-125

		byte d = (byte)345l ;
		System.out.println(d) ; //89

		byte e = (byte)34.5 ;
		System.out.println(e) ; //34

		byte f = (byte)34.6f ;
		System.out.println(f) ; //34

		byte g = (byte)'c' ;
		System.out.println(g) ; //99

		{
			int h = (int)125 ;
			System.out.println(h) ; //125

			int i = (int)32769 ;
			System.out.println(i) ; //32769

			int j = (int)67637864 ;
			System.out.println(j) ; //67637864

			int k = (int)876.767f ;
			System.out.println(k) ;  //876

			int l = (int)667.89 ;
			System.out.println(l) ; //667

			int m = (int)'f' ;
			System.out.println(m) ; //102
		}

		{
			short n = (short)124 ;
			System.out.println(n) ; //124

			short o = (short)32766 ;
			System.out.println(o) ; //32766

			short p = (short)87767 ;
			System.out.println(p) ; //22231

			short q = (short)124l ;
			System.out.println(q) ; //124

			short r = (short)124.87f ;
			System.out.println(r) ; //124

			short s = (short)124.67 ;
			System.out.println(s) ; //124

			short t = (short)'d' ;
			System.out.println(t) ; //100
		}

		{
			char u = (char)123 ;
			System.out.println(u) ; //{

			char v = (char)32567 ;
			System.out.println(u) ; //{

			char w = (char)85645 ;
			System.out.println(w) ; //?

			char x = (char)345l ;
			System.out.println(x) ; //?

			char y = (char)123.44f ;
			System.out.println(y) ; //{

			char z = (char)123.23 ;
			System.out.println(z) ; //{

			char aa = (char)'v' ;
			System.out.println(aa) ; //v
		}

		{
			long bb = (long)43 ;
			System.out.println(bb) ; //43

			long cc = (long)34562 ;
			System.out.println(cc) ; //34562

			long dd = (long)347654 ;
			System.out.println(dd) ; //347654

			long ee = (long)435l ;
			System.out.println(ee) ; //435

			long ff = (long)43.675f ;
			System.out.println(ff) ; //43

			long gg = (long)43.765 ;
			System.out.println(gg) ; //43

			long hh = (long)'d' ;
			System.out.println(hh) ; //100
		}

		{
			float ii = (float)76 ;
			System.out.println(ii) ; //76.0

			float jj = (float)123 ;
			System.out.println(jj) ; //123.0

			float kk = (float)764546 ;
			System.out.println(kk) ; //764546.0

			float ll = (float)764l ;
			System.out.println(ll) ; //764.0

			float mm = (float)7623.442f ;
			System.out.println(mm) ; //7623.442

			float nn = (float)7634.57 ;
			System.out.println(nn) ; //7634.57

			float oo = (float)'e' ;
			System.out.println(oo) ; //101.0
		}

		{
			double pp = (double)85 ;
			System.out.println(pp) ; //85.0

			double qq = (double)35755 ;
			System.out.println(qq) ; //35755.0

			double rr = (double)85367 ;
			System.out.println(rr) ; //85367.0

			double ss = (double)8525l ;
			System.out.println(ss) ; //8525.0

			double tt = (double)853.545f ;
			System.out.println(tt) ; //853.5449829101562

			double uu = (double)852.52 ;
			System.out.println(uu) ; //852.52

			double vv = (double)'v' ;
			System.out.println(vv) ; //118.0
		}
	}
}
