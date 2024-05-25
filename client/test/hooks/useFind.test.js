import { beforeEach, describe, jest, test } from "@jest/globals";
import { renderHook } from "@testing-library/react-hooks";
import { useFind } from "../../src/hooks/useFind";
import { VALID_DISTANCES_RESPONSE } from '../sharedMocks';

describe('useFind', () => {

    let hook;
    beforeEach(() => {
        jest.clearAllMocks();
        fetch.resetMocks();
        const {result} = renderHook(() => useFind());
        hook = result;
    })

    test('base: cumulative', ()=>{

    })
});