package com.hitanshudhawan.spannablestringparser

object TestingUtils {

    val testStrings by lazy {
        mapOf(
            1 to "Hello Hitanshu",
            2 to "Hello {Hitanshu}",
            3 to "Hello `Hitanshu`",
            4 to "Hello <Hitanshu>",
            5 to "Hello :Hitanshu:",
            6 to "Hello |Hitanshu|",
            7 to "Hello ;Hitanshu;",
            8 to "Hello /Hitanshu/",
            9 to "Hello </Hitanshu/>",
            //
            10 to "{`Hitanshu`<a:b|c;d:e/>}",
            11 to "{ `Hitanshu`<a:b|c;d:e/>}",
            12 to "{ `Hitanshu` <a:b|c;d:e/>}",
            13 to "{ `Hitanshu` < a:b|c;d:e/>}",
            14 to "{ `Hitanshu` < a :b|c;d:e/>}",
            15 to "{ `Hitanshu` < a : b|c;d:e/>}",
            16 to "{ `Hitanshu` < a : b |c;d:e/>}",
            17 to "{ `Hitanshu` < a : b | c;d:e/>}",
            18 to "{ `Hitanshu` < a : b | c ;d:e/>}",
            19 to "{ `Hitanshu` < a : b | c ; d:e/>}",
            20 to "{ `Hitanshu` < a : b | c ; d :e/>}",
            21 to "{ `Hitanshu` < a : b | c ; d : e/>}",
            22 to "{ `Hitanshu` < a : b | c ; d : e />}",
            23 to "{ `Hitanshu` < a : b | c ; d : e /> }",
            //
            24 to "  {`Hitanshu`<a:b|c;d:e/>}{`Dhawan`<a:b|c;d:e/>}  ",
            25 to " {{`Hitanshu`<a:b|c;d:e/>}{`Dhawan`<a:b|c;d:e/>}} ",
            26 to "{{`Hitanshu`<a:b|c;d:e/>}}{{`Dhawan`<a:b|c;d:e/>}}",
            27 to "   {`Hitanshu`<a:b|c;d:e/>} {`Dhawan`<a:b|c;d:e/>}   ",
            28 to "  {{`Hitanshu`<a:b|c;d:e/>} {`Dhawan`<a:b|c;d:e/>}}  ",
            29 to " {{`Hitanshu`<a:b|c;d:e/>}} {{`Dhawan`<a:b|c;d:e/>}} ",
            //
            30 to "{ `Hitanshu Dhawan : Android Developer` <a:b|c;d:e/> }",
            31 to "{ `Hitanshu Dhawan | Android Developer` <a:b|c;d:e/> }",
            32 to "{ `Hitanshu Dhawan ; Android Developer` <a:b|c;d:e/> }",
            //
            33 to "Hello { `Hitanshu Dhawan` <a:b|c;d:e/> }, How are you bro?",
            34 to "Hello { `Hitanshu Dhawan` <a:b|c;d:e/> }, How are you { `bro` <a:b|c;d:e/> }?",
            35 to "Hello { ` Hitanshu Dhawan ` <a:b|c;d:e/> }, How are you bro?",
            36 to "Hello { ` Hitanshu Dhawan ` <a:b|c;d:e/> }, How are you { ` bro ` <a:b|c;d:e/> }?",
            //
            37 to "Hello { `    ` < a : b | c ; d : e /> }",
            38 to "Hello {   ``   < a : b | c ; d : e /> }",
            39 to "Hello   `Hitanshu` < a : b | c ; d : e /> }",
            40 to "Hello {  Hitanshu` < a : b | c ; d : e /> }",
            41 to "Hello { `Hitanshu  < a : b | c ; d : e /> }",
            42 to "Hello { `Hitanshu`   a : b | c ; d : e /> }",
            43 to "Hello { `Hitanshu` <   : b | c ; d : e /> }",
            44 to "Hello { `Hitanshu` < a   b | c ; d : e /> }",
            45 to "Hello { `Hitanshu` < a :   | c ; d : e /> }",
            46 to "Hello { `Hitanshu` < a : b   c ; d : e /> }",
            47 to "Hello { `Hitanshu` < a : b |   ; d : e /> }",
            48 to "Hello { `Hitanshu` < a : b | c   d : e /> }",
            49 to "Hello { `Hitanshu` < a : b | c ;   : e /> }",
            50 to "Hello { `Hitanshu` < a : b | c ; d   e /> }",
            51 to "Hello { `Hitanshu` < a : b | c ; d :   /> }",
            52 to "Hello { `Hitanshu` < a : b | c ; d : e  > }",
            53 to "Hello { `Hitanshu` < a : b | c ; d : e /  }",
            54 to "Hello { `Hitanshu` < a : b | c ; d : e    }",
            55 to "Hello { `Hitanshu` < a : b | c ; d : e />  ",
            56 to "Hello { `Hitanshu` < a : b | c ; d : e | /> }",
            57 to "Hello { `Hitanshu` < a : b | c ; d : e ; /> }",
            58 to "Hello { `    ` < a : b | c ; d : e /> }, How are you bro?",
            59 to "Hello {   ``   < a : b | c ; d : e /> }, How are you bro?",
            60 to "Hello   `Hitanshu` < a : b | c ; d : e /> }, How are you bro?",
            61 to "Hello {  Hitanshu` < a : b | c ; d : e /> }, How are you bro?",
            62 to "Hello { `Hitanshu  < a : b | c ; d : e /> }, How are you bro?",
            63 to "Hello { `Hitanshu`   a : b | c ; d : e /> }, How are you bro?",
            64 to "Hello { `Hitanshu` <   : b | c ; d : e /> }, How are you bro?",
            65 to "Hello { `Hitanshu` < a   b | c ; d : e /> }, How are you bro?",
            66 to "Hello { `Hitanshu` < a :   | c ; d : e /> }, How are you bro?",
            67 to "Hello { `Hitanshu` < a : b   c ; d : e /> }, How are you bro?",
            68 to "Hello { `Hitanshu` < a : b |   ; d : e /> }, How are you bro?",
            69 to "Hello { `Hitanshu` < a : b | c   d : e /> }, How are you bro?",
            70 to "Hello { `Hitanshu` < a : b | c ;   : e /> }, How are you bro?",
            71 to "Hello { `Hitanshu` < a : b | c ; d   e /> }, How are you bro?",
            72 to "Hello { `Hitanshu` < a : b | c ; d :   /> }, How are you bro?",
            73 to "Hello { `Hitanshu` < a : b | c ; d : e  > }, How are you bro?",
            74 to "Hello { `Hitanshu` < a : b | c ; d : e /  }, How are you bro?",
            75 to "Hello { `Hitanshu` < a : b | c ; d : e    }, How are you bro?",
            76 to "Hello { `Hitanshu` < a : b | c ; d : e />  , How are you bro?",
            77 to "Hello { `Hitanshu` < a : b | c ; d : e | /> }, How are you bro?",
            78 to "Hello { `Hitanshu` < a : b | c ; d : e ; /> }, How are you bro?",
            //
            79 to "{  `{`  <a:b|c;d:e/> }",
            80 to "{  ```  <a:b|c;d:e/> }",
            81 to "{  `<`  <a:b|c;d:e/> }",
            82 to "{  `:`  <a:b|c;d:e/> }",
            83 to "{  `|`  <a:b|c;d:e/> }",
            84 to "{  `;`  <a:b|c;d:e/> }",
            85 to "{  `/>`  <a:b|c;d:e/> }",
            86 to "{  `}`  <a:b|c;d:e/> }",
            87 to "{  ` { `  <a:b|c;d:e/> }",
            88 to "{  ` ` `  <a:b|c;d:e/> }",
            89 to "{  ` < `  <a:b|c;d:e/> }",
            90 to "{  ` : `  <a:b|c;d:e/> }",
            91 to "{  ` | `  <a:b|c;d:e/> }",
            92 to "{  ` ; `  <a:b|c;d:e/> }",
            93 to "{  ` /> `  <a:b|c;d:e/> }",
            94 to "{  ` } `  <a:b|c;d:e/> }",
            //
            95 to "Hello { `Hitanshu` < a : b | c ; d : e : f /> }, How are you bro?",
            96 to "Hello { `Hitanshu` < a   b   c   d   e   f /> }, How are you bro?",
            97 to "Hello { `Hitanshu` < a : b : c : d : e : f /> }, How are you bro?",
            98 to "Hello { `Hitanshu` < a | b | c | d | e | f /> }, How are you bro?",
            99 to "Hello { `Hitanshu` < a ; b ; c ; d ; e ; f /> }, How are you bro?",
            //
            100 to "Hello   Hitanshu < a : b | c ; d : e />  , How are you bro?",
            101 to "Hello { Hitanshu < a : b | c ; d : e /> }, How are you bro?",
            //
            102 to "{{{`Hitanshu`<a:b|c;d:e/>}{`Dhawan`<a:b|c;d:e/>}}}",
            103 to "{{{{`Hitanshu`<a:b|c;d:e/>}{`Dhawan`<a:b|c;d:e/>}}}}",
            //
            104 to "Hello { < a : b | c ; d : e /> }, How are you bro?",
            //
            105 to "{   `'`  <a:b|c;d:e/> }",
            106 to "{  ` ' `  <a:b|c;d:e/> }",
            107 to "Hello { `Hitanshu's Friend` <a:b|c;d:e/> }, How are you { `bro` <a:b|c;d:e/> }?",
            108 to "Hello { ` Hitanshu's Friend ` <a:b|c;d:e/> }, How are you { ` bro ` <a:b|c;d:e/> }?",
            //
            109 to "{ `Google` < a : b | c ; d :  https://www.google.com   /> }",
            110 to "{ `Google` < a : b | c ; d :  https://www.google.com/  /> }",
            111 to "{ `Google` < a : b | c ; d : `https://www.google.com`  /> }",
            112 to "{ `Google` < a : b | c ; d : `https://www.google.com/` /> }",
            113 to "{ `Google` < a : b | c ; d :  www|www   /> }",
            114 to "{ `Google` < a : b | c ; d : `www|www`  /> }",
            115 to "{ `Google` < a : b | c ; d :  www;www   /> }",
            116 to "{ `Google` < a : b | c ; d : `www;www`  /> }",
            117 to "{ `Google` <a:b|c;d:`https://www.one.com`|`https://www.two.com`;e:`https://www.three.com`/> }",
            //
            118 to "{`Hitanshu``Dhawan`<a:b|c;d:e/>}",
            119 to "{ `Hitanshu` `Dhawan` < a : b | c ; d : e /> }",
            //
            120 to "{ `Hitanshu` < property : `v a l u e` /> }",
            121 to "{ `Hitanshu` < property : ` v a l u e ` /> }"
        )
    }

}