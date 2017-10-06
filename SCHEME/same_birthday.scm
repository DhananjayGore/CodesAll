(define (same_birthday ls3 ls4)
      (cond ((and (null? ls3) (null? ls4)) 0)
            ((or (null? ls3) (null? ls4)) 0)
            
