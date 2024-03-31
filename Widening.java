class Widening 
{
	public static void main(String[] args) 
	{
		{
		    /*byte b = 128 ;
			System.out.println(b) ; */ //CTE

			byte a = 't' ;
			System.out.println(a) ; //116

			/*byte y = 129 ;
			System.out.println(y) ;*/ //CTE

			/*byte c = 23647646 ;
			System.out.println(c) ;*/ //CTE

			/*byte d = 23.43 ;
			System.out.println(d) ;*/ //CTE

			/*byte e = 34.23f ;
			System.out.println(e) ;*/ //CTE
		}

		{
			short m = 12 ;
			System.out.println(m) ; //12

			short n = 129 ;
			System.out.println(n) ; //129

			short p = 's' ;
			System.out.println(p) ; //115

			/*short q = 32768 ;
			System.out.println(q) ;*/ //CTE

			/*short r = 334l ;
			System.out.println(r) ;*/ //CTE

			/*short s = 34.3f ;
			System.out.println(s) ;*/ //CTE

			/*short t = 23.5 ;
			System.out.println(t) ;*/ //CTE

		}

		{
			int f = 12 ;
			System.out.println(f) ; //12

			int g = 'd' ;
			System.out.println(g) ; //100

			int h = 130 ;
			System.out.println(h) ; //130

			int i = 377876867;
			System.out.println(i) ; //377876867
			
			/*int j = 56l;
			System.out.println(j) ;*/ //CTE

			/*int k = 45.3 ;
			System.out.println(k) ;*/ //CTE

			/*int l = 23.44f ;
			System.out.println(l) ;*/ //CTE
		}

		{
			long u = 12 ;
			System.out.println(u) ; //12

			long v = 129 ;
			System.out.println(v) ; //129

			long w = 378463 ;
			System.out.println(w) ; //378463

			long x = 'e' ;
			System.out.println(x) ; //101

			long y = 5636l ;
			System.out.println(y) ; //5636

			/*long z = 23.4f ;
			System.out.println(z) ;*/ //CTE

			/*long aa = 234.3 ;
			System.out.println(aa) ;*/ //CTE
		} 


		{
			float cc = 23 ;
			System.out.println(cc) ; //23.0

			float dd = 234 ;
			System.out.println(dd) ; //234.0

			float ee = 546l ;
			System.out.println(ee) ; //546.0

			float ff = 'f' ;
			System.out.println(ff) ; //102.0

			float gg = 23.5f ;
			System.out.println(gg) ; //23.5

			/*float hh = 43.2 ;
			System.out.println(hh) ;*/ //CTE
		}

		{
			double ii = 12 ;
			System.out.println(ii) ; //12.0

			double jj = 276 ;
			System.out.println(jj) ; //276.0

			double kk = 238976 ;
			System.out.println(kk) ; //238976

			double ll = 7346l ;
			System.out.println(ll) ; //7346

			double mm = 'd' ;
			System.out.println(mm) ; //100

			double nn = 34.5f ;
			System.out.println(nn) ; //34.5

			double oo = 23.54 ;
			System.out.println(oo) ; //23.54
		}
		
	}
}
