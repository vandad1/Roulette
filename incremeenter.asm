.orig x3000

;AND R7, R7, #0                      ; NULSTIL
;AND R6, R6, #0                      ; NULSTIL
;AND R5, R5, #0                      ; NULSTIL


; GET NAME
    LEA R0, GIVENAVN                ; GEMMER ARRAY I R0
    PUTS                            ; PRINTER ARRAY
    LEA R3, NAVN                    ; Allokerer 15 pladser ind i R3
    LD R4, MAXNAVN                  ; Load 15 ind i vores counter, så der maks er 15 karakterer
    
    NAME GETC                       ; Læs en karakter
    OUT                             ; output karakteren til terminal
    ADD R1, R0, #-10                ; tjek om "enter" er blevet trykket
    BRz  DONE                       ; Hvis enter er trykket, hop ud
    STR R0, R3, #0                  ; Gemmer karakteren i r0
    ADD R3, R3, #1                  ; incrementer adressen, så vi læser næste karakter
    ADD R4, R4, #-1                 ; Decrementer counter, så der maks er plads til 15
    BRp   NAME                      ; stop med at skriv når der er skrevet 15 karakterer
    DONE                            ; hopper herned hvis der er trykket enter
; GET NAME



LEA R0, BANK                         ; GEM ARRAY I BANKEN
PUTS                                 ; OUTPUT HVOR MEGET DER ER I BANKEN
ENTER GETC




LD R4, MAXBET
; GET BET
    LEA R0, GIVEBET                 ; Loader array ind i r3
    PUTS                            ; outputter vores array
    BETS GETC
    OUT
    ADD R1, R0, #-10                ; tjek om "enter" er blevet trykket
    BRz  DONE1                       ; Hvis enter er trykket, hop ud
    STR R0, R3, #0                  ; Gemmer karakteren i r0
    ADD R3, R3, #1                  ; incrementer adressen, så vi læser næste karakter
    ADD R4, R4, #-1                 ; Decrementer counter, så der maks er plads til 15
    BRp   BETS                      ; stop med at skriv når der er skrevet 15 karakterer
    DONE1                            ; hopper herned hvis der er trykket enter
; GET BET
    
    


LD R5, ANTALGANGE                   ; GEMMER 50 I R5, DA VI VIL KØRE LOOPET IGENNEM MAKS 20 GANGE
SPIN        LD R7, TAL              ; GEM ARRAY I REGISTER
    LOOP    LDR R6, R7, #1          ; LOADER R7 (ARRAY) IND I R6
            ADD R7, R7, #1          ; INCREMENTER R7 SÅ VI FÅR NÆSTE ADRESSE
            ADD R5, R5, #-1         ; DECREMENTER R5, SÅ LOOPET KØRER EN R5-1 GANGE 
            BRp LOOP                ; KØRER LOOPET INDTIL R5 NÅR 0
            HALT                    ; STOPPER LOOPET



GIVENAVN    .STRINGZ    "Please enter your name: " 
NAVN        .BLKW 15
MAXNAVN .FILL #15



GIVEBET     .STRINGZ     "Place your bet: "
BET         .BLKW 5
MAXBET  .FILL #5


BANK        .STRINGZ    "You have 500 in the bank. Press any button to continue: \n"
BANKP1  .FILL x


ANTALGANGE  .FILL #50

TAL     .FILL    X300C
        .FILL #01
        .FILL #02
        .FILL #03
        .FILL #04
        .FILL #05
        .FILL #06
        .FILL #07
        .FILL #08
        .FILL #09
        .FILL #10
        .FILL #11
        .FILL #12
        .FILL #13
        .FILL #14
        .FILL #15
        .FILL #16
        .FILL #17
        .FILL #18
        .FILL #19
        .FILL #20
        .FILL #21
        .FILL #22
        .FILL #23
        .FILL #24
        .FILL #25
        .FILL #26
        .FILL #27
        .FILL #28
        .FILL #29
        .FILL #30
        .FILL #31
        .FILL #32
        .FILL #33
        .FILL #34
        .FILL #35
        .FILL #36
        .FILL #37
        .FILL #38
        .FILL #39
        .FILL #40
        .FILL #41
        .FILL #42
        .FILL #43
        .FILL #44
        .FILL #45
        .FILL #46
        .FILL #47
        .FILL #48
        .FILL #49
        .FILL #50
        
.END
        