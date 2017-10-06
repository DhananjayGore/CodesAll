(define (sum list)
	(cond ((null? list)
	0
	)
	(else (+ (car list) (sum(cdr list)))
	)
	)
)
