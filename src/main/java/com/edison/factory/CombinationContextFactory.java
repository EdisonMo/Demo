package com.edison.factory;

import com.edison.impl.CombinationContext;
import com.edison.impl.DigitsLetterCombinator;
import com.edison.util.CharactersUtil;

public class CombinationContextFactory {

    public static CombinationContext getContext(String intputString) {

    	if (CharactersUtil.isNumeric(intputString)) {

            return new CombinationContext(new DigitsLetterCombinator(intputString));

        }else
        return null;
    }

}
