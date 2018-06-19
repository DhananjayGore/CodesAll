//NOT WORKING


/*char *decimal_point;		/* Decimal point character.  
  char *thousands_sep;		 Thousands separator.  
  char *int_curr_symbol;
  char *currency_symbol;	/* Local currency symbol.  
  char *mon_decimal_point;	/* Decimal point character.  
  char *mon_thousands_sep;	/* Thousands separator.  
  char *mon_grouping;		/* Like `grouping' element (above).  
  char *positive_sign;		/* Sign for positive values.  
  char *negative_sign;		/* Sign for negative values.  
  char int_frac_digits;		/* Int'l fractional digits.  
  char frac_digits;		/* Local fractional digits.  */
#include<stdio.h>
#include<conio.h>
#include<locale.h>
main()
{  struct lconv  *lc;
lc= localeconv ( );
printf("%s",*lc->thousands_sep);
}